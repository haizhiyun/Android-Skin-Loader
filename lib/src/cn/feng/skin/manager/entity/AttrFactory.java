package cn.feng.skin.manager.entity;


public class AttrFactory {
	
	private static final String BACKGROUND = "background";
	private static final String TEXT_COLOR = "textColor";
	private static final String LIST_SELECTOR = "listSelector";
	private static final String DIVIDER = "divider";
	
	public static SkinAttr get(String attrName, int attrValueRefId, String attrValueRefName, String typeName){
		SkinAttr mSkinAttr = null;
		if(BACKGROUND.equals(attrName)){ 
			mSkinAttr = new BackgroundAttr();
		}else if(TEXT_COLOR.equals(attrName)){ 
			mSkinAttr = new TextColorAttr();
		}else if(LIST_SELECTOR.equals(attrName)){ 
			mSkinAttr = new ListSelectorAttr();
		}
		else if(DIVIDER.equals(attrName)){ 
			mSkinAttr = new DividerAttr();
		}
		else{
			return null;
		}
		mSkinAttr.attrName = attrName;
		mSkinAttr.attrValueRefId = attrValueRefId;
		mSkinAttr.attrValueRefName = attrValueRefName;
		mSkinAttr.attrValueTypeName = typeName;
		return mSkinAttr;
	}
	
	public static boolean isSupportedAttr(String attrName){
		if(BACKGROUND.equals(attrName)){ 
			return true;
		}
		if(TEXT_COLOR.equals(attrName)){ 
			return true;
		}
		if(LIST_SELECTOR.equals(attrName)){ 
			return true;
		}
		if(DIVIDER.equals(attrName)){ 
			return true;
		}
		return false;
	}
}
