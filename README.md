Інструкція щодо завантаження папки із колекцією на ваш пк,запуск роботи колекції та сама колекція.

Спершу потрібно зайти на GitHub Peter00007 та знайти відповідний репозиторій із колекцією.

Після чого скопіювати ссилку для клонування проекту із GitHub https://github.com/Peter00007/BitBucket.git

Після чого створюємо папку, куди хочемо завантажити проект.

Відкриваємо GitBush відповідної папки та прописуємо команду: git clone https://github.com/Peter00007/BitBucket.git

Проект успішно завантажується у відповідну папку.

Відкриваємо проект у одному із середовищ програмування Java.

Шукаємо клас Runner та запускаємо проект.

Клас TopListLogic мість всі методи, які доступні в колекції TopList, а саме:
 - додавання за значення у колекцію(void addByValue(int value))
 - додавання на певну позицію та значенням(void addByPosition(int position, int value))
 - видалення елемента по позиції(void removeElementByPosition(int position))
 - видалення елемента по значенню(void removeElementByValue(int value))
 - пошук елемента за позицією(int searchByPosition(int position))
 - пошук елемента по значенню( boolean searchByValue(int value))
 - пошук максимального значення(int searchMaxElement())
 - пошук мінімального значення(int searchMinElement())
 - знаходження середнього арифметичного значення всієї колекції( double arithmeticAverage())
 
 У класі Runner потрібно створити езкемпляр класу TopListLogic? який реалізує колекцію TopList та викликати необхідний метод із відповідними параметрами з вищенаведених.
 