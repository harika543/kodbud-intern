class Library:
    store_name="old name"    #class variable
    def library(cls):
        print(cls.store_name)
    def change_name(cls,new):
        cls.store_name=new
    def show(cls):
        print(cls.store_name)
o=Library()
o.change_name("new store")
o.show()
