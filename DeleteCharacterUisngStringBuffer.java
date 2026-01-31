
class DeleteCharacterUisngStringBuffer
{
	public static void main(String args[])
	{
		String str=("hi this is baadshah");
		StringBuffer s = new StringBuffer(str);
		s.delete(0,3);
		System.out.println("string after deleting from index 0 to 3"+s);
		s.deleteCharAt(5);
		System.out.println(" after deleting char at 5:"+s);
	}
}

