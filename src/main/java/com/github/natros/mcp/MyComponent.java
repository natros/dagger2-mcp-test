package com.github.natros.mcp;

import dagger.Component;

@Component(modules = ServicesModule.class)
public interface MyComponent {
  Main getMain();
}
