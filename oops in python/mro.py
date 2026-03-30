# in mutliple inheritence we use super() for getting properties of parent with out error
class A:
    def display(self):
        print("A")
class B:
    def display(self):
        print("B")
class C(A,B):# order A,B ante A class properties print avuthai ,B class properties print avavu.
    def display(self):
        print("C")
        super().display()
c1=C()
c1.display()

#incase 2 parents class properties display cheyali anukunte super() ani classes lo tesukovali
class A:
    def display(self):
        print("A")
        super().display()
class B:
    def display(self):
        print("B")
        super().display()
class C(A,B):
    def display(self):
        print("C")
        super().display()
c1=C()
c1.display()
print(C.mro())


#using base class
'''class Base:
    def display(self):
        pass
class A:
    def __init__(self,a):
        self.a=a
    def display(self):
        print("A")
class B:
    def __init__(self,b):
        self.b=b
    def display(self):
        print("B")
class C(A,B):
   def __init__(self,a,b):
       super().__init__(a,b)
       print(f"{self.a},{self.b}")
    def display(self):
        print("C")
        super().display()
c1=C()
c1.display()
print(C.mro())'''


class base:
    def __init__(self,*args):
        pass
    def display(self):
        pass
class A:
    def __init__(self,a,*args):
        self.a=a
        super().__init__(*args)
    def display(self):
        print("A")
class B:
    def __init__(self,b,*args):
        self.b=b
        super().__init__(*args)
    def display(self):
        print("B")
class C(A,B,Base):
    def __init__(self,a,b):
        super().__init__(a,b)
        print(f"{self.a},{self.b}")
    def display(self):
        print("C")
        A.display(self)
        B.display(self)
c=C(5,10)
c.display()
print(C.mro())
