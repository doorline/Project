#tkinterCKBTN.py
import tkinter
def btnCheck():
    if ck_val.get() == True: 
        print('버튼이 체크 되었음')
    else: 
        print('버튼이 체크 되지않았음')

win = tkinter.Tk() 
win.title="체크버튼연습"
win.geometry("400x400")
ck_val = tkinter.BooleanVar() 
ck_val.set(False)
ck_btn= tkinter.Checkbutton(text='체크버튼',font=("System",20),variable=ck_val,command=btnCheck)
ck_btn.pack()
win.mainloop()