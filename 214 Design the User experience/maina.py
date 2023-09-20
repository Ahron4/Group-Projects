#   a214_simple_window1.py
#   A program creates a window on your screen using Tkinter.
#TODO Add a label to frame_auth


import tkinter as tk

def test_my_button():
#TODO Use get method of ent_password when the button is pressed, and store result
    user_pass = ent_password.get()
#TODO Configure the label in frame_auth to display the password
    lbl_display.config(text=user_pass)
    frame_auth.tkraise()

# main window
root = tk.Tk()
root.wm_geometry("400x300")
root.title("Authorization")

#create empty frame

frame_login = tk.Frame(root)
frame_login.grid(row=0, column=0)
frame_auth = tk.Frame(root)
frame_auth.grid(row=0, column=0, sticky="news")


lbl_username = tk.Label(frame_login, text='Username:', font="Courier")
lbl_username.pack(pady=5)
ent_username = tk.Entry(frame_login, bd=3)
ent_username.pack(pady=5)

lbl_password = tk.Label(frame_login, text='Password:',font="Courier")
lbl_password.pack(padx=5)
ent_password = tk.Entry(frame_login, bd=3, show="*")
ent_password.pack(pady=5)

btn_login = tk.Button(frame_login, text="Login", command=test_my_button)
btn_login.pack(padx=175, pady=20)

#TODO: Add a label to frame_auth
lbl_display = tk.Label(frame_auth, text='password', font='Arial' )#add two more options
lbl_display.pack(padx=5)

frame_login.tkraise()
root.mainloop()