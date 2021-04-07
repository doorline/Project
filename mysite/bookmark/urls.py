"""mysite URL Configuration

The `urlpatterns` list routes URLs to views. For more information please see:
    https://docs.djangoproject.com/en/3.1/topics/http/urls/
Examples:
Function views
    1. Add an import:  from my_app import views
    2. Add a URL to urlpatterns:  path('', views.home, name='home')
Class-based views
    1. Add an import:  from other_app.views import Home
    2. Add a URL to urlpatterns:  path('', Home.as_view(), name='home')
Including another URLconf
    1. Import the include() function: from django.urls import include, path
    2. Add a URL to urlpatterns:  path('blog/', include('blog.urls'))
"""

from django.urls import path
from bookmark import views
app_name='bookmark'
urlpatterns = [
    #class-based views
    path('',views.BookmarkLV.as_view(),name='index'),
    #http://127.0.0.1:8000/bookmark 이후에 빈칸이면 index로 가라
    #/bookmark 인거는 mysite url에서 정함
    path('<int:pk>/',views.BookmarkDV.as_view(),name='detail'),
    #<int:pk> 주소에 pk오면 북마크 상세내용화면으로 가라
    path('add/', views.BookmarkCreateView.as_view(), name='add'),
    path('change/', views.BookmarkChangeLV.as_view(), name='change'),
    path('<int:pk>/update/',views.BookmarkUpdateView.as_view(), name='update'),
    path('<int:pk>/delete/', views.BookmarkDeleteView.as_view(), name='delete'),
    
    
]
