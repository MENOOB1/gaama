from django.shortcuts import render
from .models import Music
# Create your views here.
def index(request):
	mus=Music.objects.all()
	return render(request,'index.html',{'mus':mus})