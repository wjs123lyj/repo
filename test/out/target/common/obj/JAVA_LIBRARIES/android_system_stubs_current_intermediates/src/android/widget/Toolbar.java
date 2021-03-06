package android.widget;
public class Toolbar
  extends android.view.ViewGroup
{
public static interface OnMenuItemClickListener
{
public abstract  boolean onMenuItemClick(android.view.MenuItem item);
}
public static class LayoutParams
  extends android.app.ActionBar.LayoutParams
{
public  LayoutParams(android.content.Context c, android.util.AttributeSet attrs) { super((android.view.ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!"); }
public  LayoutParams(int width, int height) { super((android.view.ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!"); }
public  LayoutParams(int width, int height, int gravity) { super((android.view.ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!"); }
public  LayoutParams(int gravity) { super((android.view.ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!"); }
public  LayoutParams(android.widget.Toolbar.LayoutParams source) { super((android.view.ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!"); }
public  LayoutParams(android.app.ActionBar.LayoutParams source) { super((android.view.ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!"); }
public  LayoutParams(android.view.ViewGroup.MarginLayoutParams source) { super((android.view.ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!"); }
public  LayoutParams(android.view.ViewGroup.LayoutParams source) { super((android.view.ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!"); }
}
public  Toolbar(android.content.Context context) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  Toolbar(android.content.Context context, android.util.AttributeSet attrs) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  Toolbar(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  Toolbar(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  void setPopupTheme(int resId) { throw new RuntimeException("Stub!"); }
public  int getPopupTheme() { throw new RuntimeException("Stub!"); }
public  void onRtlPropertiesChanged(int layoutDirection) { throw new RuntimeException("Stub!"); }
public  void setLogo(int resId) { throw new RuntimeException("Stub!"); }
public  boolean isOverflowMenuShowing() { throw new RuntimeException("Stub!"); }
public  boolean showOverflowMenu() { throw new RuntimeException("Stub!"); }
public  boolean hideOverflowMenu() { throw new RuntimeException("Stub!"); }
public  void dismissPopupMenus() { throw new RuntimeException("Stub!"); }
public  void setLogo(android.graphics.drawable.Drawable drawable) { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable getLogo() { throw new RuntimeException("Stub!"); }
public  void setLogoDescription(int resId) { throw new RuntimeException("Stub!"); }
public  void setLogoDescription(java.lang.CharSequence description) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getLogoDescription() { throw new RuntimeException("Stub!"); }
public  boolean hasExpandedActionView() { throw new RuntimeException("Stub!"); }
public  void collapseActionView() { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getTitle() { throw new RuntimeException("Stub!"); }
public  void setTitle(int resId) { throw new RuntimeException("Stub!"); }
public  void setTitle(java.lang.CharSequence title) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getSubtitle() { throw new RuntimeException("Stub!"); }
public  void setSubtitle(int resId) { throw new RuntimeException("Stub!"); }
public  void setSubtitle(java.lang.CharSequence subtitle) { throw new RuntimeException("Stub!"); }
public  void setTitleTextAppearance(android.content.Context context, int resId) { throw new RuntimeException("Stub!"); }
public  void setSubtitleTextAppearance(android.content.Context context, int resId) { throw new RuntimeException("Stub!"); }
public  void setTitleTextColor(int color) { throw new RuntimeException("Stub!"); }
public  void setSubtitleTextColor(int color) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getNavigationContentDescription() { throw new RuntimeException("Stub!"); }
public  void setNavigationContentDescription(int resId) { throw new RuntimeException("Stub!"); }
public  void setNavigationContentDescription(java.lang.CharSequence description) { throw new RuntimeException("Stub!"); }
public  void setNavigationIcon(int resId) { throw new RuntimeException("Stub!"); }
public  void setNavigationIcon(android.graphics.drawable.Drawable icon) { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable getNavigationIcon() { throw new RuntimeException("Stub!"); }
public  void setNavigationOnClickListener(android.view.View.OnClickListener listener) { throw new RuntimeException("Stub!"); }
public  android.view.Menu getMenu() { throw new RuntimeException("Stub!"); }
public  void setOverflowIcon(android.graphics.drawable.Drawable icon) { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable getOverflowIcon() { throw new RuntimeException("Stub!"); }
public  void inflateMenu(int resId) { throw new RuntimeException("Stub!"); }
public  void setOnMenuItemClickListener(android.widget.Toolbar.OnMenuItemClickListener listener) { throw new RuntimeException("Stub!"); }
public  void setContentInsetsRelative(int contentInsetStart, int contentInsetEnd) { throw new RuntimeException("Stub!"); }
public  int getContentInsetStart() { throw new RuntimeException("Stub!"); }
public  int getContentInsetEnd() { throw new RuntimeException("Stub!"); }
public  void setContentInsetsAbsolute(int contentInsetLeft, int contentInsetRight) { throw new RuntimeException("Stub!"); }
public  int getContentInsetLeft() { throw new RuntimeException("Stub!"); }
public  int getContentInsetRight() { throw new RuntimeException("Stub!"); }
protected  android.os.Parcelable onSaveInstanceState() { throw new RuntimeException("Stub!"); }
protected  void onRestoreInstanceState(android.os.Parcelable state) { throw new RuntimeException("Stub!"); }
protected  void onDetachedFromWindow() { throw new RuntimeException("Stub!"); }
public  boolean onTouchEvent(android.view.MotionEvent ev) { throw new RuntimeException("Stub!"); }
protected  void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); }
protected  void onLayout(boolean changed, int l, int t, int r, int b) { throw new RuntimeException("Stub!"); }
public  android.widget.Toolbar.LayoutParams generateLayoutParams(android.util.AttributeSet attrs) { throw new RuntimeException("Stub!"); }
protected  android.widget.Toolbar.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams p) { throw new RuntimeException("Stub!"); }
protected  android.widget.Toolbar.LayoutParams generateDefaultLayoutParams() { throw new RuntimeException("Stub!"); }
protected  boolean checkLayoutParams(android.view.ViewGroup.LayoutParams p) { throw new RuntimeException("Stub!"); }
}
