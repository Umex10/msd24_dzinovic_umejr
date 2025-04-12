# Writing Good Git Commit Messages

## Example of a Well-Written Commit Message

In this exercise, I made sure to follow a clear structure for my Git commit message.

**`Add Javadoc comments to Calculator class and update .gitignore`**

- Added Javadoc comments for the class, its variables, and methods in the `Calculator` class  
- Updated `.gitignore` to properly exclude the `.vscode` directory by adding a trailing slash (`.vscode/`)

detail: the **imperative mood** is used in the title of the commit message.  
Instead of writing *"Added"*, I used *"Add"* — this is considered best practice in Git, as it reads like a command or instruction to the codebase (e.g., “Add this change”).

## Further Best Practices

### Best Practices for Files

- If you fix two unrelated bugs, create **two separate commits** — each addressing a specific issue. This improves clarity and makes troubleshooting easier.
- **Always test your code** before committing. Committing untested or broken code is considered bad practice.

### Best Practices for Commit Messages

- Keep the **commit title under 50 characters**.
- If **issue numbers** are given use them!
- Start your message with a **capital letter**.
- Use the **imperative mood** in the commit title (e.g., `Fix bug`, not `Fixed bug`).
- Add a **more detailed description** below the title if the change is complex — use the body to explain *what* and *why*, not just *how*.
- Mention the **specific files or components** you changed so other developers can immediately understand the context.
- Use consistent formatting for commits throughout your team or project to maintain readability and professionalism.



