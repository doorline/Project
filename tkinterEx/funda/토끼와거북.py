#토끼와거북
import threading,time 
def turtleRun():
    for i in range(1,21):
        time.sleep(1.0)
        print(f'거북이{i}m')
    print('거북이 20m 도착!!!')
def rabbitRun():
    for i in range(1,15):
        time.sleep(0.35)
        print(f'토끼{i}m')
    print(f'토끼{i}m 낮잠')
    time.sleep(11)
    print(f'토끼-잠깸{i}m')
    for i in range(15,21):
        time.sleep(0.55)
        print(f'토끼-{i}m')
    print('토끼-20m 도착!!!')
    


threading.Thread(target=turtleRun).start()
threading.Thread(target=rabbitRun).start()   