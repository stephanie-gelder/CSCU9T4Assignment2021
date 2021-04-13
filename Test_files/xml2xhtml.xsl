<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

	<xsl:output method="text"/>

	<xsl:template match="/">
		<html>
			<body style="font-family:Arial;font-size:12pt;background-color:#EEEEEE">
				<h1>Bibliography Summary</h1>
				<h2>Journal Articles:</h2>
				<dl>
					<dd>Number of journal articles: <xsl:value-of select="count(/bibliography/item[@category='journal'])"/></dd>
					<dd>Most frequent journal:
						<xsl:variable name="journalTitles">
							<xsl:for-each select="distinct-values(/bibliography/item/journalTitle)">
								<xsl:element name="journalTitle"><xsl:value-of select="."/></xsl:element>
							</xsl:for-each>
						</xsl:variable>

						<xsl:variable name="items">
							<xsl:copy-of select="/bibliography/item"/>
						</xsl:variable>

						<xsl:for-each select="$journalTitles/journalTitle">
							<xsl:variable name="journalTitle"><xsl:value-of select="."/></xsl:variable>
							<xsl:value-of select="$journalTitle"/> - <xsl:value-of select="count($items/item[journalTitle=$journalTitle])"/><xsl:text>&#xa;</xsl:text>
							<!-- <xsl:for-each select="$items/item[journalTitle/$journalTitle]/doi"><xsl:value-of select="."/><xsl:text>&#xa;</xsl:text></xsl:for-each>-->
						</xsl:for-each></dd>
					<dd>Most frequent publisher:
						<xsl:variable name="publishers">
							<xsl:for-each select="distinct-values(/bibliography/item[@category='journal']/publisher)">
								<xsl:element name="publisher"><xsl:value-of select="."/></xsl:element>
							</xsl:for-each>
						</xsl:variable>

						<xsl:variable name="items">
							<xsl:copy-of select="/bibliography/item[@category='journal']"/>
						</xsl:variable>

						<xsl:for-each select="$publishers/publisher">
							<xsl:variable name="publisher"><xsl:value-of select="."/></xsl:variable>
							<xsl:value-of select="$publisher"/> - <xsl:value-of select="count($items/item[publisher=$publisher])"/><xsl:text>&#xa;</xsl:text>
							<!-- <xsl:for-each select="$items/item[publisher/$publisher]/doi"><xsl:value-of select="."/><xsl:text>&#xa;</xsl:text></xsl:for-each>-->
						</xsl:for-each></dd>
				</dl>
				<h2>Conference Proceedings</h2>
				<dl>
					<dd>Number of conference proceedings: <xsl:value-of select="count(/bibliography/item[@category='conference'])"/></dd>
					<dd>Most frequent venue:
						<xsl:variable name="venues">
							<xsl:for-each select="distinct-values(/bibliography/item/venue)">
								<xsl:element name="venue"><xsl:value-of select="."/></xsl:element>
							</xsl:for-each>
						</xsl:variable>

						<xsl:variable name="items">
							<xsl:copy-of select="/bibliography/item"/>
						</xsl:variable>

						<xsl:for-each select="$venues/venue">
							<xsl:variable name="venue"><xsl:value-of select="."/></xsl:variable>
							<xsl:value-of select="$venue"/> - <xsl:value-of select="count($items/item[venue=$venue])"/><xsl:text>&#xa;</xsl:text>
							<!-- <xsl:for-each select="$items/item[venue/$venue]/doi"><xsl:value-of select="."/><xsl:text>&#xa;</xsl:text></xsl:for-each>-->
						</xsl:for-each></dd>
					<dd>Most frequent location:
						<xsl:variable name="locations">
							<xsl:for-each select="distinct-values(/bibliography/item/location)">
								<xsl:element name="location"><xsl:value-of select="."/></xsl:element>
							</xsl:for-each>
						</xsl:variable>

						<xsl:variable name="items">
							<xsl:copy-of select="/bibliography/item"/>
						</xsl:variable>

						<xsl:for-each select="$locations/location">
							<xsl:variable name="location"><xsl:value-of select="."/></xsl:variable>
							<xsl:value-of select="$location"/> - <xsl:value-of select="count($items/item[location=$location])"/><xsl:text>&#xa;</xsl:text>
							<!-- <xsl:for-each select="$items/item[location/$location]/doi"><xsl:value-of select="."/><xsl:text>&#xa;</xsl:text></xsl:for-each>-->
						</xsl:for-each></dd>
				</dl>
				<h2>Book Chapters</h2>
				<dl>
					<dd>Number of book chapters: <xsl:value-of select="count(/bibliography/item[@category='book chapter'])"/></dd>
					<dd>Most frequent book:
						<xsl:variable name="bookTitles">
							<xsl:for-each select="distinct-values(/bibliography/item/bookTitle)">
								<xsl:element name="bookTitle"><xsl:value-of select="."/></xsl:element>
							</xsl:for-each>
						</xsl:variable>

						<xsl:variable name="items">
							<xsl:copy-of select="/bibliography/item"/>
						</xsl:variable>

						<xsl:for-each select="$bookTitles/bookTitle">
							<xsl:variable name="bookTitle"><xsl:value-of select="."/></xsl:variable>
							<xsl:value-of select="$bookTitle"/> - <xsl:value-of select="count($items/item[bookTitle=$bookTitle])"/><xsl:text>&#xa;</xsl:text>
							<!-- <xsl:for-each select="$items/item[bookTitle/$bookTitle]/doi"><xsl:value-of select="."/><xsl:text>&#xa;</xsl:text></xsl:for-each>-->
						</xsl:for-each> </dd>
					<dd>Most frequent publisher:
						<xsl:variable name="publishers">
							<xsl:for-each select="distinct-values(/bibliography/item[@category='book chapter']/publisher)">
								<xsl:element name="publisher"><xsl:value-of select="."/></xsl:element>
							</xsl:for-each>
						</xsl:variable>

						<xsl:variable name="items">
							<xsl:copy-of select="/bibliography/item[@category='book chapter']"/>
						</xsl:variable>

						<xsl:for-each select="$publishers/publisher">
							<xsl:variable name="publisher"><xsl:value-of select="."/></xsl:variable>
							<xsl:value-of select="$publisher"/> - <xsl:value-of select="count($items/item[publisher=$publisher])"/><xsl:text>&#xa;</xsl:text>
							<!-- <xsl:for-each select="$items/item[publisher/$publisher]/doi"><xsl:value-of select="."/><xsl:text>&#xa;</xsl:text></xsl:for-each>-->
						</xsl:for-each></dd>
				</dl>
			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>