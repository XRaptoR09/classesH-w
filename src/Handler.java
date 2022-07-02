import java.util.Arrays;
import java.util.ArrayList;
import java.util.jar.Attributes.Name;
import java.lang.reflect.Array;
import java.lang.String;
public class Handler {

	public static void main(String[] args) {
//		int i = 0;
		String text = "Java ivan lorem ipsum, dolor sit amet consectetur adipisicing elit.";
		System.out.println(text);
//		ArrayList spacesindex = new ArrayList();
//		String enteringSymbol = " ";
//		int indOfStart = text. indexOf(enteringSymbol);
//		int index = indOfStart, indOfChanging=text.indexOf(enteringSymbol, index);
//		if(indOfStart>-1){
//			System.out.print(indOfStart + " = " + enteringSymbol + "; "); 
//			while (indOfChanging>-1) { 
//				index++;
//				indOfChanging = text.indexOf(enteringSymbol, index); if (indOfChanging>-1  ) {
//					index = indOfChanging;
////					spacesindex.add(index);
//					System.out.print(indOfChanging + " = " + enteringSymbol + "; ");
//				}
//			}
//		}
		String[] array = text.split(" ");
		String allWord; 
		char capitalLetter;
		for (int i = 0; i < array.length; i++) {
			allWord = array[i];
			capitalLetter = allWord.charAt(0);
//			capitalLetter.toUpperCase();
 			System.out.print(allWord + " ");
 		}
// 		while (i < text.length()) {
// 			i++;
//			if (i-1==spacesindex) {
//				
//			}else{
// 			 break;
// 			 }
//		}
		
		
	}


}
