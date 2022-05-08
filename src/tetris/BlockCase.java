package tetris;

public class BlockCase implements Images {
	private BlockData[] blockData;
	private int blockX;
	private int blockY;
	
	public void setting(int x, int y, BlockData[] data) {
		blockX = x;
		blockY = y;
		blockData = data;
	}
	public void blockCase_0(String color) {
		switch(color) {
		case "red":		
			blockData[0] = new BlockData(blockX, blockY);
			blockData[1] = new BlockData(blockX - 50, blockY);
			blockData[2] = new BlockData(blockX, blockY + 50);
			blockData[3] = new BlockData(blockX + 50, blockY + 50);
			break;
		case "orange":
			blockData[0] = new BlockData(blockX, blockY);
			blockData[1] = new BlockData(blockX + 50, blockY);
			blockData[2] = new BlockData(blockX - 50, blockY);
			blockData[3] = new BlockData(blockX - 50, blockY + 50);
			break;
		case "yellow":	
			blockData[0] = new BlockData(blockX, blockY);
			blockData[1] = new BlockData(blockX - 50, blockY);
			blockData[2] = new BlockData(blockX - 50, blockY + 50);
			blockData[3] = new BlockData(blockX, blockY + 50);		
			break;
		case "green":	
			blockData[0] = new BlockData(blockX, blockY);
			blockData[1] = new BlockData(blockX + 50, blockY);
			blockData[2] = new BlockData(blockX, blockY + 50);
			blockData[3] = new BlockData(blockX - 50, blockY + 50);
			break;
		case "cyan":	
			blockData[0] = new BlockData(blockX + 50, blockY);
			blockData[1] = new BlockData(blockX, blockY);
			blockData[2] = new BlockData(blockX - 50, blockY);
			blockData[3] = new BlockData(blockX - 100, blockY);
			break;
		case "blue":	
			blockData[0] = new BlockData(blockX, blockY);
			blockData[1] = new BlockData(blockX - 50, blockY);
			blockData[2] = new BlockData(blockX + 50, blockY);
			blockData[3] = new BlockData(blockX + 50, blockY + 50);
			break;
		case "purple":
			blockData[0] = new BlockData(blockX, blockY);
			blockData[1] = new BlockData(blockX - 50, blockY);
			blockData[2] = new BlockData(blockX + 50, blockY);
			blockData[3] = new BlockData(blockX, blockY + 50);
			break;
		}
	}
	
	public void blockCase_1(String color) {
		switch(color) {
		case "red":		
			blockData[0] = new BlockData(blockX, blockY);
			blockData[1] = new BlockData(blockX, blockY + 50);
			blockData[2] = new BlockData(blockX + 50, blockY);
			blockData[3] = new BlockData(blockX + 50, blockY - 50);
			break;
		case "orange":
			blockData[0] = new BlockData(blockX, blockY);
			blockData[1] = new BlockData(blockX, blockY - 50);
			blockData[2] = new BlockData(blockX, blockY + 50);
			blockData[3] = new BlockData(blockX + 50, blockY + 50);
			break;
		case "yellow":	
			blockCase_0(color);
			break;
		case "green":
			blockData[0] = new BlockData(blockX, blockY);
			blockData[1] = new BlockData(blockX, blockY - 50);
			blockData[2] = new BlockData(blockX + 50, blockY);
			blockData[3] = new BlockData(blockX + 50, blockY + 50);
			break;
		case "cyan":	
			blockData[0] = new BlockData(blockX, blockY - 50);
			blockData[1] = new BlockData(blockX, blockY);
			blockData[2] = new BlockData(blockX, blockY + 50);
			blockData[3] = new BlockData(blockX, blockY + 100);
			break;
		case "blue":	
			blockData[0] = new BlockData(blockX, blockY);
			blockData[1] = new BlockData(blockX, blockY + 50);
			blockData[2] = new BlockData(blockX, blockY - 50);
			blockData[3] = new BlockData(blockX + 50, blockY - 50);
			break;
		case "purple":
			blockData[0] = new BlockData(blockX, blockY);
			blockData[1] = new BlockData(blockX, blockY + 50);
			blockData[2] = new BlockData(blockX, blockY - 50);
			blockData[3] = new BlockData(blockX + 50, blockY);
			break;
		}
	}
	
	public void blockCase_2(String color) {
		switch(color) {
		case "red":		
			blockCase_0(color);
			break;
		case "orange":
			blockData[0] = new BlockData(blockX, blockY);
			blockData[1] = new BlockData(blockX - 50, blockY);
			blockData[2] = new BlockData(blockX + 50, blockY);
			blockData[3] = new BlockData(blockX + 50, blockY - 50);
			break;
		case "yellow":	
			blockCase_0(color);
			break;
		case "green":
			blockCase_0(color);
			break;
		case "cyan":	
			blockCase_0(color);
			break;
		case "blue":	
			blockData[0] = new BlockData(blockX, blockY);
			blockData[1] = new BlockData(blockX + 50, blockY);
			blockData[2] = new BlockData(blockX - 50, blockY);
			blockData[3] = new BlockData(blockX - 50, blockY - 50);
			break;
		case "purple":
			blockData[0] = new BlockData(blockX, blockY);
			blockData[1] = new BlockData(blockX + 50, blockY);
			blockData[2] = new BlockData(blockX - 50, blockY);
			blockData[3] = new BlockData(blockX, blockY - 50);
			break;
		}
	}
	
	public void blockCase_3(String color) {
		switch(color) {
		case "red":		
			blockCase_1(color);
			break;
		case "orange":
			blockData[0] = new BlockData(blockX, blockY);
			blockData[1] = new BlockData(blockX, blockY + 50);
			blockData[2] = new BlockData(blockX, blockY - 50);
			blockData[3] = new BlockData(blockX - 50, blockY - 50);
			break;
		case "yellow":	
			blockCase_0(color);
			break;
		case "green":
			blockCase_1(color);
			break;
		case "cyan":	
			blockCase_1(color);
			break;
		case "blue":	
			blockData[0] = new BlockData(blockX, blockY);
			blockData[1] = new BlockData(blockX, blockY - 50);
			blockData[2] = new BlockData(blockX, blockY + 50);
			blockData[3] = new BlockData(blockX - 50, blockY + 50);
			break;
		case "purple":
			blockData[0] = new BlockData(blockX, blockY);
			blockData[1] = new BlockData(blockX, blockY - 50);
			blockData[2] = new BlockData(blockX, blockY + 50);
			blockData[3] = new BlockData(blockX - 50, blockY);
			break;
		}
	}
}
