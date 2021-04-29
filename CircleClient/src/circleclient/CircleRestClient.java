/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circleclient;

import java.io.StringReader;
import javax.xml.bind.JAXB;
import model.Result;
import util.CircleClient;

/**
 *
 * @author taveesap
 */
public class CircleRestClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CircleClient client = new CircleClient();
        String xml = client.getXml("5");
        Result circle = JAXB.unmarshal(new StringReader(xml), Result.class);
        System.out.println("เส้นรอบวง = "+circle.getCircumference());
        System.out.println("พื้นที่วงกลม = "+circle.getCircle());
    }
    
}
