--Soru 1: film tablosunda bulunan title ve description sütunlarındaki verileri sıralayınız.

SELECT title, description FROM film;

--Soru 2: film tablosunda bulunan title ve description sütunlarındaki verileri sıralayınız.

SELECT title, description FROM film
WHERE length > 60 AND length < 75;

--Soru 3: film tablosunda bulunan title ve description sütunlarındaki verileri sıralayınız.

SELECT * FROM film
WHERE rental_rate = 0.99 AND (replacement_cost = 12.99 OR replacement_cost = 28.99);

--Soru 4: film tablosunda bulunan title ve description sütunlarındaki verileri sıralayınız.

SELECT first_name, last_name FROM customer
WHERE first_name = 'Mary';

--Soru 5: film tablosunda bulunan title ve description sütunlarındaki verileri sıralayınız.

SELECT length, title, rental_rate FROM film
WHERE length <= 50 AND NOT(rental_rate = 2.99 OR rental_rate = 4.99);
