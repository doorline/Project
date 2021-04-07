#guibutton.py
import tkinter
import tkinter.messagebox

#showinfo, showwarning, showerror, askquestion, askokcancal
# 둘이 아이콘이 다르다 쓰는법은 같음
def click_info():
    msg = tkinter.messagebox.showinfo("정보 메시지", "메시지 발생")
    
def click_warning():
    msg = tkinter.messagebox.showwarning("경고 메시지", "경고 발생")

    
win = tkinter.Tk()
win.title("파이썬 GUI 프로그램 버튼")

win.geometry("400x300") #따옴표 필수

#라벨을 붙이기
label = tkinter.Label(win, text="아래 버튼을 클릭하세요.", font=("System", 20))
label.place(x=100, y=100)

#버튼1을 붙이기 
button_info = tkinter.Button(win, text="정보 메시지 확인.", font=("System", 20),
                        command=click_info)
button_info.place(x=100, y=150)

#버튼2을 붙이기
button_warning = tkinter.Button(win, text="경고 메시지 확인.", font=("System", 20),
                        command=click_warning)
button_warning.place(x=100, y=200)


win.mainloop()