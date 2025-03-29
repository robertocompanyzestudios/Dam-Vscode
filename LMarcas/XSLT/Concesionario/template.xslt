<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <html>
            <body>
                <table border="1">
                    <tr>
                        <th>Grado</th>
                        <th>Tipo</th>
                    </tr>

                    <xsl:apply-templates/>

                </table>
            </body>
        </html>
    </xsl:template>

    <xsl:template match="ciclos/ciclo">
        <tr>
            <td><xsl:value-of select="nombre"/></td>
            <td><xsl:value-of select="grado"/></td>
        </tr>
    </xsl:template>

</xsl:stylesheet>
