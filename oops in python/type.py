class Person:
    def __init__(self,name):
        self.name=name
    def show(self):
        print(f"{self.name}")
class Employee(Person):
    def __init__(self,name,age):
        super().__init__(name)
        self.age=age
    def show(self):
        print(f"{self.name},{self.age}")

e=Employee("navi",20)
e.show()
print(type(e))
print(issubclass(Employee,Person))
print(isinstance(e,Employee))
print(hasattr(e,'name'))
print(getattr(e,'age'))
setattr(e,'colour','green')
print(hasattr(e,'colour'))
print(getattr(e,'colour'))
delattr(e,'colour')
print(hasattr(e,'colour'))
print(id(e))
print(dir(e))
