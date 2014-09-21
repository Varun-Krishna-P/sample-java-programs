package code.practise.WebExample;
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import java.util.Scanner;

public class WriteXMLFile {

	public static void main (String args[]){	
		String id,fName,lName,Nick,Salary;
		try
		{
			Scanner input = new Scanner(System.in);
			System.out.println("Please enter the staff's ID:");
			id = input.nextLine();
			System.out.println("Please enter the first name:");
			fName = input.nextLine();
			System.out.println("Please enter the last name:");
			lName = input.nextLine();
			System.out.println("Please enter the nick name:");
			Nick = input.nextLine();
			System.out.println("Please enter the Salary");;
			Salary = input.nextLine();
			DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
			Document document = documentBuilder.newDocument();
			Element rootElement = document.createElement("Company");
			document.appendChild(rootElement);
			Element staff = document.createElement("Staff");
			rootElement.appendChild(staff);
			
			Attr attr = document.createAttribute("id");
			attr.setNodeValue(id);
			
			staff.setAttributeNode(attr);
			
			Element firstName = document.createElement("FirstName");
			firstName.appendChild(document.createTextNode(fName));
			staff.appendChild(firstName);
			
			Element lastName = document.createElement("LastName");
			lastName.appendChild(document.createTextNode(lName));
			staff.appendChild(lastName);
			
			Element nick = document.createElement("NickName");
			nick.appendChild(document.createTextNode(Nick));
			staff.appendChild(nick);
			
			Element salary = document.createElement("Salary");
			salary.appendChild(document.createTextNode(Salary));
			staff.appendChild(salary);
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource dSource = new DOMSource(document);	
			
			File directory = new File( "xml");
			if (!directory.exists())
			{				
				directory.mkdir();											
			}
			
			if(directory.exists() || directory.list().length == 0)
			{
				File xmlFile = new File (directory.getPath()+"/TestXml.xml");
				if(!xmlFile.exists())
				{
					System.out.println("The directory is successfully created!!!");			
					
//					File xmlFile = new File ("/TestXml.xml");
					StreamResult streamResult = new StreamResult(new File(xmlFile.toString()));
//					StreamResult streamResult = new StreamResult(System.out);
					transformer.transform(dSource, streamResult);
					
					System.out.println("The file saved successfully");
				}
				else
					System.out.println("The file: "+xmlFile.getName()+" already exists");
			}
			else
			{
				System.out.println(directory.list().length);
			}
		}
		catch(ParserConfigurationException pce)
		{
			pce.printStackTrace();
		}
		catch(TransformerException tfe)
		{
			tfe.printStackTrace();			
		}		
	}
}
