from django.contrib import admin
from .models import Bookmark 

# Register your models here.
@admin.register(Bookmark)
class BookmarkAdmin(admin.ModelAdmin):
    list_display = ('id', 'title', 'url')
    #bookmark 모델을 등록하는데 화면에 id, title, url을 출력시켜라
    #여기서 url은 내가 저장한 북맠이겟지 model.py에서 url
    