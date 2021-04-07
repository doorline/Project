'''
Created on 2021. 1. 14.

@author: pc373
'''
from urllib.request import urlopen
from bs4 import BeautifulSoup

url = 'http://www.dr-chuck.com/'

result = urlopen(url)
result_html = result.read()
result_soup = BeautifulSoup(result_html, 'html.parser')
a = result_soup.find_all('a')
print(a)
