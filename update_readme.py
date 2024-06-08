import json

# Load Wakatime stats
with open('wakatime.json', 'r') as f:
    data = json.load(f)

# Check if 'data' key exists
if 'data' in data:
    project_stats = data['data']

    # Create a string to update README
    wakatime_details = "## Wakatime Stats\n\n"
    wakatime_details += "| Project | Time Spent |\n"
    wakatime_details += "| --- | --- |\n"

    for day in project_stats:
        for project in day['projects']:
            wakatime_details += f"| {project['name']} | {project['text']} |\n"

    # Read the README file
    with open('README.md', 'r') as f:
        readme = f.read()

    # Replace the placeholder with actual data
    new_readme = readme.replace("<!--START_SECTION:waka-->", f"<!--START_SECTION:waka-->\n{wakatime_details}")

    # Write the new README content
    with open('README.md', 'w') as f:
        f.write(new_readme)
else:
    print("No 'data' key found in the JSON response.")
