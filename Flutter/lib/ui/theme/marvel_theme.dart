import 'package:flutter/material.dart';

class MarvelTheme {
  static ThemeData defaultTheme() =>
      ThemeData(
        colorScheme: defaultColorScheme(),

      );

  static ColorScheme defaultColorScheme() =>
    const ColorScheme(
        brightness: Brightness.dark,
        primary: Color(0xFFED1D24),
        onPrimary: Color(0xFFFFFFFF),
        secondary: Color(0xFFED1D24),
        onSecondary: Color(0xFFFFFFFF),
        error: Color(0xFF0E0202),
        onError: Color(0xFFFFFFFF),
        background: Color(0xFF4D090B),
        onBackground: Color(0xFFFFFFFF),
        surface: Color(0xFFED1D24),
        surfaceVariant: Color(0xFFE6CFCF),
        onSurface: Color(0xFFFFFFFF),
        onSurfaceVariant: Color(0xFF4D090B)
    );

  static List<Color> defaultGradient() =>
      const [
        Color(0xFF4D090B),
        Color(0xFF0E0202),
        Color(0xFF000000)
      ];

  static Color defaultTransparent() =>
      Colors.transparent;
}