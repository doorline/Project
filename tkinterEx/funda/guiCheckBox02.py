#guiCheckBox02.py
import tkinter

def btn_check():
    if temp.get() == True:
        print("버튼이 체크 되었습니다.")
    else:
        print("버튼이 체크 되지 않았습니다.")
        
win = tkinter.Tk()
win.title("체크 버튼 만들기")
win.geometry("400x400")

temp = tkinter.BooleanVar()
temp.set(False) #초기값 false로 지정

ck_btn = tkinter.Checkbutton(text="체크 버튼", font=("System", 20),
                             variable=temp, command=btn_check)
ck_btn.pack()

win.mainloop()