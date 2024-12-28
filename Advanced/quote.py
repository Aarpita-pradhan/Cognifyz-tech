import requests
from bs4 import BeautifulSoup

def fetch_quotes(url, author=None):
    response = requests.get(url)
    if response.status_code == 200:
        soup = BeautifulSoup(response.text, 'html.parser')
        quotes = soup.find_all('div', class_='quote')

        for quote in quotes:
            text = quote.find('span', class_='text').get_text()
            quote_author = quote.find('small', class_='author').get_text()
    
            if author and author.lower() != quote_author.lower():
                continue
            print(f'Quote: {text}\n')
    else:
        print(f'Failed to retrieve data. Status code: {response.status_code}')

def main():
    url = 'https://quotes.toscrape.com'
    authors = [
        "Albert Einstein",
        "J.K. Rowling",
        "Jane Austen",
        "Marilyn Monroe",
        "André Gide",
        "Thomas A. Edison",
        "Eleanor Roosevelt",
        "Steve Martin"
    ]
    print("Welcome to the Quote Fetcher!")
    print("Available authors:")
    for index, author in enumerate(authors, start=1):
        print(f"{index }. {author}")
    
    while True:
        try:
            choice = input("\nEnter the number of the author you want to read quotes from (or type 'exit' to quit): ")
            if choice.lower() == 'exit':
                print("Exiting the program. Goodbye!")
                break
            
            # Validate the choice
            if not choice.isdigit() or not (1 <= int(choice) <= len(authors)):
                print("Invalid choice. Please select a valid author number.")
                continue
            
            selected_author = authors[int(choice) - 1]
            print(f"\nFetching quotes from {selected_author}...\n")
            fetch_quotes(url, selected_author)
        
        except Exception as e:
            print(f"An error occurred: {e}")

if __name__ == '__main__':
    main()