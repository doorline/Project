# tkinterTest.py
import tkinter
import tkinter.font

#print(tkinter.font.families))
#가장 기본적인 tkinter

#이벤트 처리 함수
def buttonClick():
    label['text'] = '앗뜨거!'


win = tkinter.Tk() #윈도우 프레임
win.title('파이썬으로 만드닌 GUI')
win.geometry('400x300')
label = tkinter.Label(win,text='문자열붙이기',font=('System',20))
#label은 원래잇는 변수인데 이걸 트킨터 레이블로 오버라이팅
#win - 옵저버, 직속상관
#font - 튜플로 값을 주고, 레이블자체는 딕셔너리 방식으로 속성 지정
button = tkinter.Button(win,text="클릭",font=('System',20),command=buttonClick)
#command - 버튼클릭시 호출할 함수

label.place(x=100,y=100) #레이블의 위치, 좌측상단에서 100씩 떨어진 곳에
button.place(x=100,y=150)
win.mainloop()