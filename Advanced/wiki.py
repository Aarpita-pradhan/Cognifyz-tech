import requests
from bs4 import BeautifulSoup

def scrape_programming_languages():
    url = 'https://en.wikipedia.org/wiki/List_of_programming_languages'
    response = requests.get(url)
    soup = BeautifulSoup(response.text, 'html.parser')
    languages = []

    #  all links in the div that contains the programming languages
    for item in soup.select('div.div-col a'):
        title = item.get_text()
        link = item['href']
        if link.startswith('/'):
            link = 'https://en.wikipedia.org' + link
        languages.append({'title': title.lower(), 'link': link})  
    return languages

def print_welcome_message():
    print("Welcome to the Programming Languages and Fundamental Subjects Finder!")
    print("You can search for programming languages or fundamental subjects.")
    print("Type 'list languages' to see all programming languages.")
    print("Type 'exit' to quit the program.")

def main():
    languages = scrape_programming_languages()
    print_welcome_message()

    while True:
        user_input = input("\nEnter your query: ").strip().lower()  
        if user_input == 'exit':
            print("Exiting the program. Goodbye!")
            break  
        if user_input == 'list languages':
            print("\nList of Programming Languages:")
            for language in languages:
                print(f"- {language['title'].capitalize()}")
            continue
         
        
        found = False
        for language in languages:
            if user_input in language['title']:
                print(f"\nFound Programming Language: {language['title'].capitalize()}: {language['link']}")
                found = True
                break
        if not found:
            print("\nNo matching programming language found. Please try again.")

if __name__ == "__main__":
    main()