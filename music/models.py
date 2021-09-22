from django.db import models

# Create your models here.
class Music(models.Model):
	Title=models.TextField()
	artist=models.TextField()
	image=models.ImageField(upload_to='songs')
	audio_file=models.FileField(blank=True,null=True)


	def __str__(self):
		return self.Title