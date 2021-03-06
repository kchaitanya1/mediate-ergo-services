/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * aapt tool from the resource data it found.  It
 * should not be modified by hand.
 */

package com.example.glowpadexample;

public final class R {
    public static final class array {
        public static final int snooze_dismiss_descriptions=0x7f060001;
        public static final int snooze_dismiss_direction_descriptions=0x7f060002;
        public static final int snooze_dismiss_drawables=0x7f060000;
    }
    public static final class attr {
        /**  Used when the handle shouldn't wait to be hit before following the finger 
         <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int alwaysTrackFinger=0x7f01000c;
        /**  Reference to an array resource that be used to announce the directions with targets around the circle. 
         <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         */
        public static final int directionDescriptions=0x7f010002;
        /**  Number of waves/chevrons to show in animation. 
         <p>Must be an integer value, such as "<code>100</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int feedbackCount=0x7f01000b;
        /**  Size of target radius. Points within this distance of target center is a "hit". 

        <attr name="hitRadius" format="dimension"/>
        
 Radius of glow under finger. 
         <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
in (inches), mm (millimeters).
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int glowRadius=0x7f010008;
        /**  Sets a drawable as the center. 
         <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         */
        public static final int handleDrawable=0x7f010003;
        /**  Inner radius of glow area. 
         <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
in (inches), mm (millimeters).
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int innerRadius=0x7f010006;
        /** <p>Must be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
"<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int jewelColor=0x7f01000f;
        /** <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
in (inches), mm (millimeters).
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int jewelOffset=0x7f01000e;
        /** <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
in (inches), mm (millimeters).
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int jewelRadius=0x7f01000d;
        /**  Outer radius of glow area. Target icons will be drawn on this circle. 
         <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
in (inches), mm (millimeters).
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int outerRadius=0x7f010007;
        /**  Drawable to use for wave ripple animation. 
         <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         */
        public static final int outerRingDrawable=0x7f010004;
        /**  Drawble used for drawing points 
         <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         */
        public static final int pointDrawable=0x7f010005;
        /**  How close we need to be before snapping to a target. 
         <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
in (inches), mm (millimeters).
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int snapMargin=0x7f01000a;
        /**  Reference to an array resource that be used as description for the targets around the circle. 
         <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         */
        public static final int targetDescriptions=0x7f010001;
        /**  Reference to an array resource that be shown as targets around a circle. 
         <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         */
        public static final int targetDrawables=0x7f010000;
        /**  Tactile feedback duration for actions. Set to '0' for no vibration. 
         <p>Must be an integer value, such as "<code>100</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int vibrationDuration=0x7f010009;
    }
    public static final class dimen {
        /**  Default glow radius for GlowPadView 
         */
        public static final int glowpadview_glow_radius=0x7f040002;
        /**  Default distance from each snap target that GlowPadView considers a "hit" 
         */
        public static final int glowpadview_inner_radius=0x7f040004;
        public static final int glowpadview_margin_bottom=0x7f040005;
        public static final int glowpadview_margin_right=0x7f040006;
        /**  Size of alarm alert outer ring. 
         */
        public static final int glowpadview_outerring_diameter=0x7f040000;
        /**  Default distance beyond which GlowPadView snaps to the matching target 
         */
        public static final int glowpadview_snap_margin=0x7f040003;
        /**  Default target placement radius for GlowPadView. Should be 1/2 of outerring diameter. 
         */
        public static final int glowpadview_target_placement_radius=0x7f040001;
    }
    public static final class drawable {
        public static final int ic_alarm_alert_outerring=0x7f020000;
        public static final int ic_alarm_alert_touch_handle=0x7f020001;
        public static final int ic_item_lighting=0x7f020002;
        public static final int ic_item_personal=0x7f020003;
        public static final int ic_item_radiation=0x7f020004;
        public static final int ic_item_ucservice=0x7f020005;
        public static final int ic_launcher=0x7f020006;
        public static final int ic_lighting_activated=0x7f020007;
        public static final int ic_lighting_normal=0x7f020008;
        public static final int ic_lockscreen_glowdot=0x7f020009;
        public static final int ic_lockscreen_handle_normal=0x7f02000a;
        public static final int ic_lockscreen_handle_pressed=0x7f02000b;
        public static final int ic_personal_activated=0x7f02000c;
        public static final int ic_personal_normal=0x7f02000d;
        public static final int ic_radiation_activated=0x7f02000e;
        public static final int ic_radiation_normal=0x7f02000f;
        public static final int ic_uc_activated=0x7f020010;
        public static final int ic_uc_normal=0x7f020011;
    }
    public static final class id {
        public static final int glow_pad_view=0x7f080000;
    }
    public static final class layout {
        public static final int activity_main=0x7f030000;
    }
    public static final class string {
        public static final int app_name=0x7f050000;
    }
    public static final class style {
        /** 
        Base application theme, dependent on API level. This theme is replaced
        by AppBaseTheme from res/values-vXX/styles.xml on newer devices.
    

            Theme customizations available in newer API levels can go in
            res/values-vXX/styles.xml, while customizations related to
            backward-compatibility can go here.
        

        Base application theme for API 11+. This theme completely replaces
        AppBaseTheme from res/values/styles.xml on API 11+ devices.
    
 API 11 theme customizations can go here. 

        Base application theme for API 14+. This theme completely replaces
        AppBaseTheme from BOTH res/values/styles.xml and
        res/values-v11/styles.xml on API 14+ devices.
    
 API 14 theme customizations can go here. 
         */
        public static final int AppBaseTheme=0x7f070000;
        /**  Application theme. 
 All customizations that are NOT specific to a particular API-level can go here. 
         */
        public static final int AppTheme=0x7f070001;
    }
    public static final class styleable {
        /** Attributes that can be used with a AnalogClock.
           <p>Includes the following attributes:</p>
           <table>
           <colgroup align="left" />
           <colgroup align="left" />
           <tr><th>Attribute</th><th>Description</th></tr>
           <tr><td><code>{@link #AnalogClock_jewelColor com.example.glowpadexample:jewelColor}</code></td><td></td></tr>
           <tr><td><code>{@link #AnalogClock_jewelOffset com.example.glowpadexample:jewelOffset}</code></td><td></td></tr>
           <tr><td><code>{@link #AnalogClock_jewelRadius com.example.glowpadexample:jewelRadius}</code></td><td></td></tr>
           </table>
           @see #AnalogClock_jewelColor
           @see #AnalogClock_jewelOffset
           @see #AnalogClock_jewelRadius
         */
        public static final int[] AnalogClock = {
            0x7f01000d, 0x7f01000e, 0x7f01000f
        };
        /**
          <p>This symbol is the offset where the {@link com.example.glowpadexample.R.attr#jewelColor}
          attribute's value can be found in the {@link #AnalogClock} array.


          <p>Must be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
"<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name android:jewelColor
        */
        public static final int AnalogClock_jewelColor = 2;
        /**
          <p>This symbol is the offset where the {@link com.example.glowpadexample.R.attr#jewelOffset}
          attribute's value can be found in the {@link #AnalogClock} array.


          <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
in (inches), mm (millimeters).
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name android:jewelOffset
        */
        public static final int AnalogClock_jewelOffset = 1;
        /**
          <p>This symbol is the offset where the {@link com.example.glowpadexample.R.attr#jewelRadius}
          attribute's value can be found in the {@link #AnalogClock} array.


          <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
in (inches), mm (millimeters).
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name android:jewelRadius
        */
        public static final int AnalogClock_jewelRadius = 0;
        /** Attributes that can be used with a GlowPadView.
           <p>Includes the following attributes:</p>
           <table>
           <colgroup align="left" />
           <colgroup align="left" />
           <tr><th>Attribute</th><th>Description</th></tr>
           <tr><td><code>{@link #GlowPadView_alwaysTrackFinger com.example.glowpadexample:alwaysTrackFinger}</code></td><td> Used when the handle shouldn't wait to be hit before following the finger </td></tr>
           <tr><td><code>{@link #GlowPadView_android_gravity com.example.glowpadexample:android_gravity}</code></td><td></td></tr>
           <tr><td><code>{@link #GlowPadView_directionDescriptions com.example.glowpadexample:directionDescriptions}</code></td><td> Reference to an array resource that be used to announce the directions with targets around the circle.</td></tr>
           <tr><td><code>{@link #GlowPadView_feedbackCount com.example.glowpadexample:feedbackCount}</code></td><td> Number of waves/chevrons to show in animation.</td></tr>
           <tr><td><code>{@link #GlowPadView_glowRadius com.example.glowpadexample:glowRadius}</code></td><td> Size of target radius.</td></tr>
           <tr><td><code>{@link #GlowPadView_handleDrawable com.example.glowpadexample:handleDrawable}</code></td><td> Sets a drawable as the center.</td></tr>
           <tr><td><code>{@link #GlowPadView_innerRadius com.example.glowpadexample:innerRadius}</code></td><td> Inner radius of glow area.</td></tr>
           <tr><td><code>{@link #GlowPadView_outerRadius com.example.glowpadexample:outerRadius}</code></td><td> Outer radius of glow area.</td></tr>
           <tr><td><code>{@link #GlowPadView_outerRingDrawable com.example.glowpadexample:outerRingDrawable}</code></td><td> Drawable to use for wave ripple animation.</td></tr>
           <tr><td><code>{@link #GlowPadView_pointDrawable com.example.glowpadexample:pointDrawable}</code></td><td> Drawble used for drawing points </td></tr>
           <tr><td><code>{@link #GlowPadView_snapMargin com.example.glowpadexample:snapMargin}</code></td><td> How close we need to be before snapping to a target.</td></tr>
           <tr><td><code>{@link #GlowPadView_targetDescriptions com.example.glowpadexample:targetDescriptions}</code></td><td> Reference to an array resource that be used as description for the targets around the circle.</td></tr>
           <tr><td><code>{@link #GlowPadView_targetDrawables com.example.glowpadexample:targetDrawables}</code></td><td> Reference to an array resource that be shown as targets around a circle.</td></tr>
           <tr><td><code>{@link #GlowPadView_vibrationDuration com.example.glowpadexample:vibrationDuration}</code></td><td> Tactile feedback duration for actions.</td></tr>
           </table>
           @see #GlowPadView_alwaysTrackFinger
           @see #GlowPadView_android_gravity
           @see #GlowPadView_directionDescriptions
           @see #GlowPadView_feedbackCount
           @see #GlowPadView_glowRadius
           @see #GlowPadView_handleDrawable
           @see #GlowPadView_innerRadius
           @see #GlowPadView_outerRadius
           @see #GlowPadView_outerRingDrawable
           @see #GlowPadView_pointDrawable
           @see #GlowPadView_snapMargin
           @see #GlowPadView_targetDescriptions
           @see #GlowPadView_targetDrawables
           @see #GlowPadView_vibrationDuration
         */
        public static final int[] GlowPadView = {
            0x010100af, 0x7f010000, 0x7f010001, 0x7f010002,
            0x7f010003, 0x7f010004, 0x7f010005, 0x7f010006,
            0x7f010007, 0x7f010008, 0x7f010009, 0x7f01000a,
            0x7f01000b, 0x7f01000c
        };
        /**
          <p>
          @attr description
           Used when the handle shouldn't wait to be hit before following the finger 


          <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          <p>This is a private symbol.
          @attr name android:alwaysTrackFinger
        */
        public static final int GlowPadView_alwaysTrackFinger = 13;
        /**
          <p>This symbol is the offset where the {@link com.example.glowpadexample.R.attr#android_gravity}
          attribute's value can be found in the {@link #GlowPadView} array.
          @attr name android:android_gravity
        */
        public static final int GlowPadView_android_gravity = 0;
        /**
          <p>
          @attr description
           Reference to an array resource that be used to announce the directions with targets around the circle. 


          <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
          <p>This is a private symbol.
          @attr name android:directionDescriptions
        */
        public static final int GlowPadView_directionDescriptions = 3;
        /**
          <p>
          @attr description
           Number of waves/chevrons to show in animation. 


          <p>Must be an integer value, such as "<code>100</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          <p>This is a private symbol.
          @attr name android:feedbackCount
        */
        public static final int GlowPadView_feedbackCount = 12;
        /**
          <p>
          @attr description
           Size of target radius. Points within this distance of target center is a "hit". 

        <attr name="hitRadius" format="dimension"/>
        
 Radius of glow under finger. 


          <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
in (inches), mm (millimeters).
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          <p>This is a private symbol.
          @attr name android:glowRadius
        */
        public static final int GlowPadView_glowRadius = 9;
        /**
          <p>
          @attr description
           Sets a drawable as the center. 


          <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
          <p>This is a private symbol.
          @attr name android:handleDrawable
        */
        public static final int GlowPadView_handleDrawable = 4;
        /**
          <p>
          @attr description
           Inner radius of glow area. 


          <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
in (inches), mm (millimeters).
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          <p>This is a private symbol.
          @attr name android:innerRadius
        */
        public static final int GlowPadView_innerRadius = 7;
        /**
          <p>
          @attr description
           Outer radius of glow area. Target icons will be drawn on this circle. 


          <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
in (inches), mm (millimeters).
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          <p>This is a private symbol.
          @attr name android:outerRadius
        */
        public static final int GlowPadView_outerRadius = 8;
        /**
          <p>
          @attr description
           Drawable to use for wave ripple animation. 


          <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
          <p>This is a private symbol.
          @attr name android:outerRingDrawable
        */
        public static final int GlowPadView_outerRingDrawable = 5;
        /**
          <p>
          @attr description
           Drawble used for drawing points 


          <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
          <p>This is a private symbol.
          @attr name android:pointDrawable
        */
        public static final int GlowPadView_pointDrawable = 6;
        /**
          <p>
          @attr description
           How close we need to be before snapping to a target. 


          <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
in (inches), mm (millimeters).
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          <p>This is a private symbol.
          @attr name android:snapMargin
        */
        public static final int GlowPadView_snapMargin = 11;
        /**
          <p>
          @attr description
           Reference to an array resource that be used as description for the targets around the circle. 


          <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
          <p>This is a private symbol.
          @attr name android:targetDescriptions
        */
        public static final int GlowPadView_targetDescriptions = 2;
        /**
          <p>
          @attr description
           Reference to an array resource that be shown as targets around a circle. 


          <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
          <p>This is a private symbol.
          @attr name android:targetDrawables
        */
        public static final int GlowPadView_targetDrawables = 1;
        /**
          <p>
          @attr description
           Tactile feedback duration for actions. Set to '0' for no vibration. 


          <p>Must be an integer value, such as "<code>100</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          <p>This is a private symbol.
          @attr name android:vibrationDuration
        */
        public static final int GlowPadView_vibrationDuration = 10;
    };
}
