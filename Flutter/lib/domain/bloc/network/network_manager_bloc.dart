import 'dart:async';

import 'package:bloc/bloc.dart';
import 'package:meta/meta.dart';

part 'network_manager_event.dart'; // Split bloc network lib into files...
part 'network_manager_state.dart';

class NetworkManagerBloc extends Bloc<NetworkManagerEvent, NetworkManagerState> {
  NetworkManagerBloc() : super(NetworkManagerInitial()) {
    on<NetworkManagerEvent>((event, emit) {
      // TODO: implement event handler
    });
  }
}
