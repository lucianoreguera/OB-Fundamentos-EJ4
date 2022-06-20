class Main {
  public static void main(String[] args) {
    // Tarea 1
    System.out.println("Tarea 1");
    int numeroIf = 10;
    if(numeroIf > 0) {
      System.out.println(numeroIf + " es positivo");
    } else if(numeroIf < 0) {
      System.out.println(numeroIf + " es negativo");
    } else {
      System.out.println(numeroIf + " es cero");
    }

    // Tarea 2
    System.out.println("Tarea 2");
    int numeroWhile = 0;
    while(numeroWhile < 3) {
      numeroWhile++;
      System.out.println(numeroWhile);
    }

    // Tarea 3
    System.out.println("Tarea 3");
    do {
      numeroWhile++;
      System.out.println(numeroWhile);
    } while(numeroWhile < 3);

    // Tarea 4
    System.out.println("Tarea 4");
    for(int numeroFor = 0; numeroFor < 3; numeroFor++) {
      System.out.println(numeroFor);
    }

    // Tarea 5
    System.out.println("Tarea 5");
    String estacion = "Primavera";
    switch(estacion) {
      case "Otoño":
        System.out.println("Otoño");
        break;
      case "Invierno":
        System.out.println("Invierno");
        break;
      case "Primavera":
        System.out.println("Primavera");
        break;
      case "Verano":
        System.out.println("Verano");
        break;
      default:
        System.out.println("No es una estación");
    }
  }
}