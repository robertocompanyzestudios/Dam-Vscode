<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
  <html>
  <body>
    <table border="1">
        <tr>
            <td><h2>Concesionario</h2></td>
            <td><h2>Ciudad</h2></td>
        </tr>
        <xsl:for-each select="concesionarios/concesionario">
            <tr>
                <td><xsl:value-of select="nombre"/></td>
                <td><xsl:value-of select="ciudad"/></td>
            </tr>
        </xsl:for-each>
    </table>

  </body>
  </html>
</xsl:template>
</xsl:stylesheet>
