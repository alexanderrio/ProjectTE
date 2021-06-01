<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>li_Password   For a strong password, please_2a9745</name>
   <tag></tag>
   <elementGuidId>dfc23da6-c3a1-425b-8ff4-81e9b2b82f86</elementGuidId>
   <selectorCollection>
      <entry>
         <key>CSS</key>
         <value>li.passwordDiv</value>
      </entry>
      <entry>
         <key>XPATH</key>
         <value>//form[@id='frmSystemUser']/fieldset/ol/li[6]</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>li</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>passwordDiv</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>Password *
  For a strong password, please use a hard to guess combination of text with upper and lower case characters, symbols and numbers
        var passwordOptions = [
        'Very Weak', 'Weak', 'Better',
        'Medium', 'Strong', 'Strongest'
    ];
        
        $(document).ready(function() {
           $('#systemUser_password').on('keyup', function(){
              showPasswordStrength($('#systemUser_password').val(), '/index.php/securityAuthentication/getPasswordStrengthAjax', 'systemUser_password', passwordOptions );
           });         
        });
    
</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;frmSystemUser&quot;)/fieldset[1]/ol[1]/li[@class=&quot;passwordDiv&quot;]</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:idRelative</name>
      <type>Main</type>
      <value>//form[@id='frmSystemUser']/fieldset/ol/li[6]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Change Password'])[1]/following::li[1]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='*'])[4]/following::li[2]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//ol/li[6]</value>
   </webElementXpaths>
</WebElementEntity>
