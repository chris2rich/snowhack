package rr.snowhack.snow.setting;

public interface ISettingUnknown {
   String getName();

   Class getValueClass();

   String getValueAsString();

   boolean isVisible();

   void setValueFromString(String var1);
}
