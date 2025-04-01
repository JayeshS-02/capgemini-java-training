package day4;

import java.util.Scanner;

public class Furniture {
	protected int modelNo;
	protected String modelName;
	protected String modelDescription;
	protected Material material;
	protected FurnitureType type;
	
	public Furniture() {
		
	}
	
	public Furniture(int modelNo, String modelName, String modelDescription, Material material, FurnitureType type) {
//		super();
		this.modelNo = modelNo;
		this.modelName = modelName;
		this.modelDescription = modelDescription;
		this.material = material;
		this.type = type;
	}

	public int getModelNo() {
		return modelNo;
	}

	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getModelDescription() {
		return modelDescription;
	}

	public void setModelDescription(String modelDescription) {
		this.modelDescription = modelDescription;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public FurnitureType getType() {
		return type;
	}

	public void setType(FurnitureType type) {
		this.type = type;
	}
	
	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter modelNo");
		modelNo = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter modelName");
		modelName = sc.nextLine();
		System.out.println("Enter modelDescription");
		modelDescription = sc.nextLine();
		System.out.println("Enter material");
		material = Material.acceptMaterial();
		System.out.println("Enter FurnitureType");
		type = FurnitureType.acceptFurnitureType();
	}
	
	public void showData() {
        System.out.println("modelNo : " + modelNo);
        System.out.println("modelName : " + modelName);
        System.out.println("modelDescription : " + modelDescription);
        System.out.println("material : " + material);
        System.out.println("type : " + type);
    }

	
	public static void main(String[] args) {
		Furniture f1 = new Furniture();
		f1.acceptData();
		f1.showData();
	}
}
