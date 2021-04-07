#canvasTest.py
import tkinter
   
win = tkinter.Tk()
win.title("캔버스 테스트입니다.")
canvas = tkinter.Canvas(win, width=400, height=200,bg='blue')
canvas.pack()

#캔버스에 이미지 넣기
py_img = tkinter.PhotoImage(file="./img/01.png")
canvas.create_image(200,100,image=py_img)

win.mainloop()