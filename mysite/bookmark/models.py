from django.db import models
from django.contrib.auth.models import User

# Create your models here.
class Bookmark(models.Model):
    #만약 pk를 생성하지않으면 자동으로 1씩 증가하는 id를 자동생성함
    title = models.CharField('TITLE', max_length=100,blank=True)
    #'TITLE'은 디비 컬럼이름, charField, max_length는 꼭 들어가야함
    url = models.URLField('URL', unique=True)
    #unique -> 중복방지
    owner=models.ForeignKey(User,on_delete=models.CASCADE, blank=True, null=True)
    
    def __str__(self):
        return self.title
    
