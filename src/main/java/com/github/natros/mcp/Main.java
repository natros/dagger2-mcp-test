package com.github.natros.mcp;

import javax.inject.Inject;

public class Main {
  @Inject
  public Main(
      AuthService authService,
      UserService userService) {
  }

  public static void main(String[] args) {
    DaggerMyComponent.create().getMain();
  }
}
