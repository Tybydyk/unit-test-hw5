Задание 1. Представьте, что вы работаете над разработкой простого приложения для записной книжки, которое позволяет пользователям добавлять, редактировать и удалять контакты.
Ваша задача - придумать как можно больше различных тестов (юнит-тесты, интеграционные тесты, сквозные тесты) для этого приложения. Напишите название каждого теста, его тип и краткое описание того, что этот тест проверяет.

предполагаем, что занимаемся разработкой back-end'а, серверная часть предполагает наличие классов Repository, Service, API.
id контактов генерируется автоматически

### Unit-tests
#### Repository
* writeContactsTest - тестируем запись списка контактов;
* readContactsTest - тестируем чтение списка контактов;

#### Service
mock-object - Repository
* readContactsServiceTest - тестируем чтение списка контактов;
* addContactServiceTest - тестируем чтение контакта;
* getContactServiceByIdTest - тестируем поиск контакта по id;
* getContactServiceByNameTest  - тестируем поиск контактов по Name;
* editContactServiceTest - тестируем редактирование контакта;
* deleteContactServiceTest - тестируем удаление контакта;
* writeContactsServiceTest - тестируем запись/перезапись списка контактов;

### Integration testing
#### Service - Repository
* writeContactsIntegrationTest - тестируем запись списка контактов;
* deleteContactsIntegrationSizeTest - тестируем чтение/удаление/запись/чтение списка контактов по количеству;
* updateContactsIntegrationField1Test - тестируем чтение/изменение/обновление списка контактов по field1;
* updateContactsIntegrationField2Test - тестируем чтение/изменение/обновление списка контактов по field2;

### End-to-end testing
#### API - Service - Repository
* writeContactsIE2ETest - тестируем запись/чтение списка контактов;
* updateContactE2ETest - тестируем чтение/изменение/удаление/обновление контактов;