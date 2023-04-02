import 'dart:async';

import 'package:connectivity_plus/connectivity_plus.dart';
import 'package:flutter/services.dart';

class NetworkManager {
  final Connectivity _connectivity = Connectivity();
  ConnectivityResult connectivityResult = ConnectivityResult.none;
  late StreamSubscription<ConnectivityResult> _connectivitySubscription;

  NetworkManager() {
    _connectivitySubscription = _connectivity.onConnectivityChanged.listen(
            (event) {
              connectivityResult = event;
            }
    );
    init();
  }


  Future<void> init() async {
    try {
      connectivityResult = await _connectivity.checkConnectivity();
    } on PlatformException catch(e) {
      connectivityResult = ConnectivityResult.none;
    }
  }
}