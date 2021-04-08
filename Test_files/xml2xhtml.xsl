<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
	  <html>
		<body style="font-family:Arial;font-size:12pt;background-color:#EEEEEE">
			<h1>Bibliography Summary</h1>

			<p>Journal Articles</p>
			<dl>
				<dd>Number of journal articles: </dd>
				<dd>Most frequent journal: </dd>
				<dd>Most frequent publisher: </dd>
			</dl>

			<p>Conference Proceedings</p>
			<dl>
				<dd>Number of conference proceedings: </dd>
				<dd>Most frequent venue: </dd>
				<dd>Most frequent location: </dd>
			</dl>

			<p>Book Chapters</p>
			<dl>
				<dd>Number of book chapters: </dd>
				<dd>Most frequent book: </dd>
				<dd>Most frequent publisher: </dd>
			</dl>
		</body>
	  </html>
	</xsl:template>
</xsl:stylesheet>