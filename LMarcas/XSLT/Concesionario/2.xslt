<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
  <html>
  <body>
    <table border="1">
        <tr>
            <td><h2>Modelo</h2></td>
            <td><h2>Marca</h2></td>
            <td><h2>Potencia</h2></td>
            <td><h2>Puertas</h2></td>
            <td><h2>Precio</h2></td>
            <td><h2>CO2</h2></td>
            <td><h2>Consumo</h2></td>
            <td><h2>Velmax</h2></td>
        </tr>
        <xsl:for-each select="concesionarios/concesionario">
            <xsl:for-each select="coches/coche">
                <tr>
                    <td><xsl:value-of select="modelo"/></td>
                    <td><xsl:value-of select="marca"/></td>
                    <td><xsl:value-of select="potencia"/></td>
                    <td><xsl:value-of select="puertas"/></td>
                    <td><xsl:value-of select="precio"/></td>
                    <td><xsl:value-of select="co2"/></td>
                    <td><xsl:value-of select="consumo"/></td>
                    <td><xsl:value-of select="velmax"/></td>
                </tr>
            </xsl:for-each>
        </xsl:for-each>
    </table>

  </body>
  </html>
</xsl:template>
</xsl:stylesheet>
