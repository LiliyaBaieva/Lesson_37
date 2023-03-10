package HomeWork36_teachers;

// Создайте класс `Soda` (для определения типа газированной воды).
public class Soda {

  private String supplement;

  // У класса должен быть конструктор, принимающий 1 аргумент при инициализации -
  // строку добавка (например, "малина"), отвечающий за добавку к выбираемому лимонаду.
  public Soda(String supplement) {
    this.supplement = supplement;
  }

  // В этом классе реализуйте метод `public String getMyDrinkString()`, возвращающий строку
  // "Газировка и {добавка}" в случае наличия добавки.
  // Если добавки нет, нужно вернуть строку "Обычная газировка".
  public String getMyDrinkString() {
    // условие-стражник: если всё плохо
    if (supplement == null) {
      return "Обычная газировка";
    }
    // важно написать именно в таком порядке.
    // если написать их в другом порядке, то возможен вызов isEmpty() для null
    // и будет NullPointerException
    if (supplement.isEmpty()) {
      return "Обычная газировка";
    }

    // после условия-стражника - когда всё хорошо, "основной" return
    return "Газировка и " + supplement;
//    return String.format("Газировка и %s", supplement);
  }
}
