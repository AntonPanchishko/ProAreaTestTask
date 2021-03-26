### Test task for pro area 
Разработать серверное приложение для интернет магазина по продаже товаров. Со следующим функционалом:
#### min requirements:
1) добавление/изменения информации по товару и по единице товара
2) API по генерации чека для единицы товара в формате pdf(список товаров(имя товара, -EAN, цена товара), общая сумма покупки)
3) Интегрировать swagger2

##### Стэк технологий:
1) Spring Boot
2) Spring Data
3) Swagger
4) Postgress

#### max requirements:
1) регистрация/логин(JWT)
2) crud по юзер
3) возможность восстановление пароля через email (к контексте задачи для локального тестирования использовать gmail smtp или outlook)
4) добавление роли администратор(один в системе), администратор имеет возможность -банить пользователей
5) реализовать возможность добавление/удаление медии для товара(и добавить медию в респонс информации по товару)
6) реализовать систему профилей в проекте(local, dev, stage, prod в контексте задачи -нужно ссылаться на  одну локальную базу данных но на разные ее schema)
7) добавление пула соединений к базе данных(HikariPool)
8) создание executable jar файла

##### The project has an N-tier structure and consists of the layers:
* Database layer;
* DAO layer (JDBC API);
* Service layer(contains the business logic);
* Layer with controllers.

#####  Running the Project:

* Download and install the JDK.
* Download and install servlet container (for example Apache Tomcat).
* Download and install postgresql Server.

##### For a login on website 
1) change database name, username and password in properties 
2) run following project
3) for **authentication** use default **username** - user and **password** - 1234
4) in swagger menu execute POST method in inject controller