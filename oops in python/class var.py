class ClsVar:
    var="CSE-F"
    def display(self):
        print("class variable value is ",ClsVar.var)

C=ClsVar()
C.display()
print("class variable value outside of class ",ClsVar.var)
ClsVar.var="CSE=f"
print("class variable value outside of class after update ",ClsVar.var)
C1=ClsVar()
C1.display()
