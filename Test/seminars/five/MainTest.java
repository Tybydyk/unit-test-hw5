package seminars.five;

import org.junit.jupiter.api.Test;
import seminars.five.number.MaxNumberModule;
import seminars.five.number.RandomNumberModule;
import seminars.five.order.OrderService;
import seminars.five.order.PaymentService;
import seminars.five.user.UserRepository;
import seminars.five.user.UserService;

import java.util.ArrayList;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;


class MainTest {
    //5.1.
//    Создайте два модуля. Первый модуль генерирует список случайных чисел.
//    Второй модуль находит максимальное число в этом списке.
//Вам нужно сначала написать юнит-тесты для каждого модуля,
// затем написать интеграционный тест, который проверяет,
// что оба модуля работают вместе правильно
    @Test
    void testRandomListGeneration(){
        RandomNumberModule randomNumberModule = new RandomNumberModule();
        ArrayList<Integer> array = randomNumberModule.getlist(5);

        assertThat(array.size()).isEqualTo(5);
    }

    @Test
    void testMaxNumber() {
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(12, 34, 52, 46, 6));
        MaxNumberModule maxNumberModule = new MaxNumberModule();

        assertThat(maxNumberModule.getMax(array)).isEqualTo(52);
    }

    //5.2.
//У вас есть два класса - UserService и UserRepository.
// UserService использует UserRepository для получения информации о пользователе.
// Ваша задача - написать интеграционный тест,
// который проверяет, что UserService и UserRepository работают вместе должным образом.
    @Test
    void IntegrationTest() {
        UserRepository userRepository = new UserRepository();
        UserService userService = new UserService(userRepository);

        String result = userService.getUserName(7);

        assertThat(result).isEqualTo("User 7");
    }

    //5.3.
//    У вас есть сервис по обработке заказов, состоящий из двух классов: OrderService и PaymentService.
//    Класс OrderService обрабатывает заказы и делает вызовы к PaymentService для обработки платежей.
//    Ваша задача - написать интеграционный тест, который проверяет, что OrderService и PaymentService
//    взаимодействуют корректно
    @Test
    void testPayment(){
        PaymentService paymentService = new PaymentService();
        OrderService orderService = new OrderService(paymentService);

        boolean result = orderService.placeOrder("23", 44.50);

        assertTrue(result);
    }

    //5.4.
//    Напишите автоматизированный тест, который выполнит следующие шаги:
//1. Открывает главную страницу Google.
//2. Вводит "Selenium" в поисковую строку и нажимает кнопку "Поиск в Google".
//3. В результатах поиска ищет ссылку на официальный сайт Selenium
//(https://www.selenium.dev) и проверяет, что ссылка действительно присутствует среди результатов поиска.

}