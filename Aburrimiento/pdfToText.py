import pytesseract
from pdf2image import convert_from_path

# Convert PDF pages to images
images = convert_from_path(pdf_path)

# Extract text from each image using OCR
ocr_text_content = ""
for image in images:
    ocr_text_content += pytesseract.image_to_string(image, lang='spa') + "\n"

# Save the OCR extracted text to a file
ocr_output_text_path = '/mnt/data/Virtualizacion_2024_OCR_text.txt'
with open(ocr_output_text_path, 'w', encoding='utf-8') as ocr_text_file:
    ocr_text_file.write(ocr_text_content)

ocr_text_content if ocr_text_content.strip() else "No se pudo extraer texto usando OCR."
