class Library:
    store_name="old name"    #class variable
    @classmethod             #class decorator
    def library(cls):
        print(cls.store_name)
    @classmethod
    def change_name(cls,new):
        cls.store_name=new
    @classmethod
    def show(cls):
        print(cls.store_name)
Library.library()
Library.change_name("new store")
Library.show()
