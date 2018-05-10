package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /*
   * Se pone un comentario para quitar el TODO que había antes.
   * @param someone Se indica un valor
   * @return devuelve la cadena Hello, con el nombre dado en el parámetro someone
   */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
