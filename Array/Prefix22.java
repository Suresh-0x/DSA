int n=sc.nextInt();
a[i]=root;
int l=0,r=0;
for(int i=0;i<n;i++)
{
  int x=sc.nextInt();
  if(x<a[i])
  {
   l=(2*l)+1;
   a[l]=x;
  }
  else
  {
    r=(2*r)+2;
    a[r]=x;
   }
  root=x;
}
  