package pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @author VsunGoK
 *
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TraditionalChineseMedicine {

	private int id;
	private int number;
	private String name;
	private String alias;
	private int type;
	private String bjyw;
	private String zhuzhi;
	private String xingwei;
	private String chandi;
	private String dosage;
	private String taboo;
	private String procession;
	private String note;

}
