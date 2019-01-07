More obvious way to use the observer pattern.

1. It is bad to place logic in the constructor - removed the addition of an observer through the constructor
2. in our case there is no need for observers to passed object itself observable - we using only passed params