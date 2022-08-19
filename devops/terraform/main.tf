# Terraform calisacagi dizinde .tf uzantili configuration file yaziyoruz. 
# Bu block olmasada bu file calisirir aws provider icin
terraform {
  required_providers {
    aws = {
      source = "hashicorp/aws"
      version = "4.26.0"
    }
  }
}
# Terraform registery'den kullanacagimiz provider blogunu aliyoruz.Terraform gerekli plugs-in'leri bu block'a bakarak install ediyor
# Provider blogunda region'u belirtmemiz gerekiyor . Hangi region'da resourcelar olusturulacak 

provider "aws" {
  region = "us-east-1"
  #access_key = "" Bunlar aws config ile localde calistigim icin onceden ayarlandi. 
  #secret_key = ""
  # Configuration options
}

resource "aws_instance" "unal-tf-instance" {   # unal-tf ismini kendimiz veriyoruz.
  ami           = "ami-0cabc39acf991f4f1"  # ami value aws consoldan kopyalandi 
  instance_type = "t2.micro"
  key_name = "unal" # Key name degisirse eski makine destroy olur yenisi run edilir 
  # count = 5 Ayni makineden 5 tane run etmek icin  
  tags = {
    Name = "terraform-unal"
  }
}

resource "aws_s3_bucket" "unal-tf-s3" {  # unal-tf-s3 ismini kendimiz verdik. 
  bucket = "unal-tf-test-bucket" # Buradaki isim aws'deki consolde gorunecek olan bucket ismi
  acl    = "private"

}



