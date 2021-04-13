<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
   
   <xsl:output method="text"/>

   <xsl:template match="/">
	<html>
	   <body>
	      <h1>Bibliography Summary</h1>
		<h2>Journal Articles:</h2>
		        <dl>
				<dd>Number of journal articles: </dd><dd><xsl:value-of select="count(/bibliography/item/journalTitle)"/></dd>
				<dd>Most frequent book: </dd>
				<dd>Most frequent publisher: </dd>
		        </dl>
		<h2>Conference Proceedings</h2>
			<dl>
				<dd>Number of conference proceedings: </dd><dd><xsl:value-of select="count(/bibliography/item/venue)"/></dd>
				<dd>Most frequent venue: </dd>
				<dd>Most frequent location: </dd>
			</dl>

			<h2>Book Chapters</h2>
			<dl>
				<dd>Number of book chapters: </dd><dd><xsl:value-of select="count(/bibliography/item/bookTitle)"/></dd>
				<dd>Most frequent book: </dd>
				<dd>Most frequent publisher: </dd>
			</dl>
		</body>
	  </html>
	</xsl:template>
</xsl:stylesheet>




<!-- <xsl:text>&#xA;Tests of the count() function:&#xA;&#xA;</xsl:text> -->

			

